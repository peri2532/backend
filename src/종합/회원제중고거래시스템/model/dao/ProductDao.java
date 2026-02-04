
package 종합.회원제중고거래시스템.model.dao;

import 종합.회원제중고거래시스템.model.dto.ProductDto;

import java.util.ArrayList;

public class ProductDao {
    private ProductDao(){}
    private static final ProductDao instance = new ProductDao();
    public static ProductDao getInstance(){ return instance; }

    private ArrayList<ProductDto > productDtos = new ArrayList<>();
    private int currentPno = 1;
    // [1] 제품 등록 , loginMno(판매자 회원번호 == 로그인중 회원번호 )
    public boolean add( String pname , int pprice , String pcomment , int loginMno ){
        ProductDto productDto = new ProductDto( currentPno, pname , pprice , pcomment , loginMno ); // 1. 제품 객체 생성 한다.
        boolean result = productDtos.add( productDto );// 2. 리스트에 제품 객체 저장
        if( result ){ currentPno++; } // * 제품 등록 성공시 제품번호 1증가 한다.
        return result; // 3. 성공 여부 반환
    }
    // [2] 제품 전체 조회
    public ArrayList< ProductDto > findAll(){
        return productDtos;
    }
}
