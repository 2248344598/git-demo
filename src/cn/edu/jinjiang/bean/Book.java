package cn.edu.jinjiang.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author 86199
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private Integer price;
}
