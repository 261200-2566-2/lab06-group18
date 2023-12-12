package Characters.ClassCharacters;

import Characters.Characters;

/**
 * คลาส SwordMan ซึ่งเป็นคลาสย่อยของ Characters
 */
public class SwordMan extends Characters {
    public final String Attack_Distance = "Melee attack";
    public final String Attack_Type = "Physical";

    /**
     * แสดงข้อมูลระยะการโจมตีของ SwordMan
     *
     * @requires Charlevel ต้องไม่เป็นค่าว่าง
     * @returns ไม่มี
     */
    @Override
    public void AttackDistance() {
        super.AttackDistance();
        System.out.println(Attack_Distance);
    }

    /**
     * แสดงประเภทการโจมตีของ SwordMan
     *
     * @requires Charlevel ต้องไม่เป็นค่าว่าง
     * @returns ไม่มี
     */
    @Override
    public void AttackType() {
        super.AttackType();
        System.out.println(Attack_Type);
    }
}
