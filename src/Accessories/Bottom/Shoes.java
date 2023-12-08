package Accessories.Bottom;

import Accessories.EpicITEM;

/**
 * คลาส Shoes สำหรับการจัดเก็บข้อมูลและความสามารถของรองเท้า
 */
public class Shoes extends EpicITEM {

    /**
     * เพิ่มความต้านทานต่อการแช่แข็ง 5%
     *
     * @effects เพิ่มความต้านทานต่อการแช่แข็ง 5%
     */
    public void abilityShoes1() {
        System.out.println("Increase resistance to Frozen 5%");
    }

    /**
     * เพิ่มความต้านทานต่อเปลวไฟ 10%
     *
     * @effects เพิ่มความต้านทานต่อเปลวไฟ 10%
     */
    public void abilityShoes2() {
        System.out.println("Increase resistance to Flame 10%");
    }
}
