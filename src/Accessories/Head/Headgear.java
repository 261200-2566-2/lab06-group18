package Accessories.Head;

import Accessories.EpicITEM;

/**
 * คลาส Headgear สำหรับการจัดเก็บข้อมูลและความสามารถของหมวก
 */
public class Headgear extends EpicITEM {

    /**
     * เพิ่มความต้านทานต่อการสลบ 20%
     *
     * @effects เพิ่มความต้านทานต่อการสลบ 20%
     */
    public void abilityHeadgear1() {
        System.out.println("Increase resistance to Stun 20%");
    }

    /**
     * เพิ่มความต้านทานต่อการแช่แข็ง 15%
     *
     * @effects เพิ่มความต้านทานต่อการแช่แข็ง 15%
     */
    public void abilityHeadgear2() {
        System.out.println("Increase resistance to Frozen 15%");
    }

    /**
     * ลดความเสียหายจากมอนสเตอร์ 5%
     *
     * @effects ลดความเสียหายจากมอนสเตอร์ 5%
     */
    public void abilityHeadgear3() {
        System.out.println("Reduce damage taken from monsters 5%");
    }
}
