package Accessories.Body;

import Accessories.EpicITEM;

/**
 * คลาส Glove สำหรับการจัดเก็บข้อมูลและความสามารถของถุงมือ
 */
public class Glove extends EpicITEM {

    /**
     * เพิ่มความต้านทานต่อการ Dash 12%
     *
     * @effects เพิ่มความต้านทานต่อการ Dash 12%
     */
    public void abilityGlove1() {
        System.out.println("Increase resistance to Dash 12%");
    }

    /**
     * ลดความเสียหายจากมอนสเตอร์ 5%
     *
     * @effects ลดความเสียหายจากมอนสเตอร์ 5%
     */
    public void abilityGlove2() {
        System.out.println("Reduce damage taken from monsters 5%");
    }
}
