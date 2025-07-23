package com.example.DataBaseMysql;

import com.example.DataBaseMysql.model.BestSellerModel;
import com.example.DataBaseMysql.repo.BestSellerRepository;
import com.example.DataBaseMysql.service.BestSellerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BestSellerTest {
    @Mock
    private BestSellerRepository bestSellerRepository;

    @InjectMocks
    private BestSellerService bestSellerService;

    //arrange
    @Test
    public void addSalesTest(){
        BestSellerModel seller = new BestSellerModel();
        seller.setStatus("loan");
        seller.setPrice(20000);
        seller.setBookTitle("the best life ever");
        seller.setCopySold(400);

        when(bestSellerRepository.save(any(BestSellerModel.class))).thenReturn(seller);

        BestSellerModel result = bestSellerService.addSales(seller);

        //act
        assertNotNull(result);
        assertEquals("loan",result.getStatus());
        assertEquals(20000,result.getPrice());
        assertEquals(400,result.getCopySold());
        assertEquals("the best life ever",result.getBookTitle());

        verify(bestSellerRepository).save(any(BestSellerModel.class));

    }
}
