package com.gominneow.main.web.dto;

import com.gominneow.main.springboot.web.dto.HelloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
/**
*  assetj = 테스트 검증 라이브러리의 검증메소드 assertTaht 사용
 *  비교는 isEqualTo 를 사용  같을때만 성공
* */

public class HelloResponseDtoTest {

    @Test
    public void lombok_test(){
        //given
        String name ="test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
