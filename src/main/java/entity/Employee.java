package entity;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

/**
 * @author : yanglujian
 * create at:  2020/9/25  11:10 上午
 *
 * 描述： 基本类型都有一个默认值
 *   int ==》0
 *   boolean ==》 fasle
 */
@Data
public class Employee {

    private Long id;

    private String lastName;

    private String email;

    private String gender;

}