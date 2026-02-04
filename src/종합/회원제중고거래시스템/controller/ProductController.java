package 종합.회원제중고거래시스템.controller;

import 종합.회원제중고거래시스템.model.dao.MemberDao;
import 종합.회원제중고거래시스템.model.dao.ProductDao;
import 종합.회원제중고거래시스템.model.dto.ProductDto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    private ProductController(){}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance(){ return instance; }

    private ProductDao pd = ProductDao.getInstance();

    // [1] 제품등록
    public boolean add( String pname , int pprice ,String pcomment){
        // ++ 로그인중인 회원번호 가져오기( 다른 controller 에서 저장중 )
        int loginMno = MemberController.getInstance().getLoginSession();
        boolean result = pd.add( pname , pprice , pcomment , loginMno );
        return result;
    }

    // [2] 제품전체조회
    public ArrayList<ProductDto> findAll(){
        ArrayList<ProductDto> result = pd.findAll();
        // * 조회된 제품목록에서 제품등록한 회원번호로 닉네임 찾기
        for( int index = 0 ; index <= result.size() - 1 ; index++ ){
            ProductDto productDto = result.get( index );
            // * 회원번호를 MemberDao 에게 전달하여 닉네임 반환받기
            String mname = MemberDao.getInstance().findMname( productDto.getMno() );
            productDto.setMname( mname );// 반환된 닉네임을 저장한다.
        } // for end
        return result;
    } // m end

}