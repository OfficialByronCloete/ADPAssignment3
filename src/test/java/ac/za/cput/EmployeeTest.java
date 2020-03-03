package ac.za.cput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    Employee emp;
    Vehicle vehi;

    @Before
    public void setUp() throws Exception {
        emp = new Employee();
        vehi = new Vehicle();
    }

    @Test
    public void getName() {
        emp.setName("Byron");
        assertEquals("Byron", emp.getName());
    }

    @Test
    public void getAge() {
        emp.setAge(24);
        assertEquals(24, emp.getAge());
    }

    @Test
    public void getEmpNum() {
        emp.setEmpNum("12345");
        assertEquals("12345", emp.getEmpNum());
    }

    @Test
    public void payment() {
        assertEquals(1000, emp.payment(), 2);
    }

    @Test
    public void getVehicleInfo(){
        vehi.setMake("Ferrari");
        emp.setVehicleInfo(vehi);
        assertEquals("Ferrari", emp.getVehicleInfo().getMake());
    }


}