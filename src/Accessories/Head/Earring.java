package Accessories.Head;

import Accessories.EpicITEM;

/**
 * คลาส Earring สำหรับการจัดเก็บข้อมูลและความสามารถของต่าง ๆ ที่เกี่ยวข้องกับต่างหู
 */
public class Earring extends EpicITEM {

    /**
     * ลดความเสียหายจากมอนสเตอร์ 5%
     *
     * @effects ลดความเสียหายจากมอนสเตอร์ 5%
     */
    public void abilityEarring1() {
        System.out.println("Reduce damage taken from monsters 5%");
    }

    /**
     * ลดความเสียหายจากผู้เล่น 5%
     *
     * @effects ลดความเสียหายจากผู้เล่น 5%
     */
    public void abilityEarring2() {
        System.out.println("Reduce damage taken from players 5%");
    }
}
