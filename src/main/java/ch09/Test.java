package ch09;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import ch09.config.MyBatisConfig;
import ch09.dao.CustomerDao;
import ch09.dto.CustomerDto;

// config : java
// sql(mapper) : java
public class Test {
    public static void main(String[] args) throws Exception{
        // Java 설정 이용
        SqlSessionFactory sqlSessionFactory = new MyBatisConfig().getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();
        
        // SQL(mapper) + Java
        // Java 의 어떤 메소드(CustomerDao) 가 호출되면 mapper 의 어떤 sql 이 수행되는지 연결

        CustomerDao customerDao = session.getMapper(CustomerDao.class);
        
        // 목록
//	      {
//	          List<CustomerDto> customerList = customerDao.listCustomer();
//	          for (CustomerDto customerDto : customerList) {
//	              System.out.println(customerDto);
//	          }
//	      }
        // 상세
//      {
//          CustomerDto customerDto = customerDao.detailCustomer(1);
//          System.out.println(customerDto);
//      }
        
        // 등록
//      {
//          CustomerDto customerDto = new CustomerDto(11, "11번째 책", "uplus press", 5000);
//          int ret = customerDao.insertCustomer(customerDto);
//          System.out.println(ret);
//          session.commit();
//      }
        // 수정
//      {
//          CustomerDto customerDto = new CustomerDto(11, "11번째 책 수정", "uplus press 수정", 10000);
//          int ret = customerDao.updateCustomer(customerDto);
//          System.out.println(ret);
//          session.commit();
//      }
        // 삭제
//        {
//            int ret = customerDao.deleteCustomer(11);
//            System.out.println(ret);
//            session.commit();
//        }
//        
        session.close();
    }
}
