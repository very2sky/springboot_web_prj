package com.work99.springboot.controller.dto;
import org.junit.Test;
import com.work99.springboot.web.dto.HelloResponseDto;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
       public void 룸북_기능_테스트(){
            String name = "Test";
            int amount = 1000;

            HelloResponseDto dto = new HelloResponseDto(name,amount);

            assertThat(dto.getName()).isEqualTo(name);
            assertThat(dto.getAmount()).isEqualTo(amount);
        }
}

