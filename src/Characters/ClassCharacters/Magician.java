package Characters.ClassCharacters;

import Characters.Characters;

/**
 * คลาส Magician ซึ่งเป็นคลาสย่อยของ Characters
 */
public class Magician extends Characters {
    public final String Attack_Distance = "Mid range attack";
    public final String Attack_Type = "Magic";

    /**
     * แสดงข้อมูลระยะการโจมตีของ Magician
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
     * แสดงประเภทการโจมตีของ Magician
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
