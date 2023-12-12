package Characters.ClassCharacters;

import Characters.Characters;

/**
 * คลาส Archer ซึ่งเป็นคลาสย่อยของ Characters
 */
public class Archer extends Characters {
    public final String Attack_Distance = "Ranged attack";
    public final String Attack_Type = "Magic or Physical";

    /**
     * แสดงข้อมูลระยะการโจมตีของ Archer
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
     * แสดงประเภทการโจมตีของ Archer
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
