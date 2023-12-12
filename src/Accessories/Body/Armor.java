package Accessories.Body;

import Accessories.EpicITEM;

/**
 * คลาส Armor สำหรับการจัดเก็บข้อมูลและความสามารถของเกราะ
 */
public class Armor extends EpicITEM {

    /**
     * ลดความเสียหายจากมอนสเตอร์ 5%
     *
     * @effects ลดความเสียหายจากมอนสเตอร์ 5%
     */
    public void abilityArmor1() {
        System.out.println("Reduce damage taken from monsters 5%");
    }

    /**
     * ลดความเสียหายจากผู้เล่น 5%
     *
     * @effects ลดความเสียหายจากผู้เล่น 5%
     */
    public void abilityArmor2() {
        System.out.println("Reduce damage taken from players 5%");
    }

    /**
     * เพิ่มความต้านทานต่อเปลวไฟ 10%
     *
     * @effects เพิ่มความต้านทานต่อเปลวไฟ 10%
     */
    public void abilityArmor3() {
        System.out.println("Increase resistance to Flame 10%");
    }
}
