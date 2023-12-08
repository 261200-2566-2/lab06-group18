package Characters.Jobs;

import Characters.ClassCharacters.SwordMan;

/**
 * คลาส Crusader ซึ่งเป็นคลาสย่อยของ SwordMan
 */
public class Crusader extends SwordMan {
    public final String jobs = "Crusader";

    /**
     * แสดงงาน (Job) ของ Crusader
     *
     * @requires Charlevel ต้องไม่เป็นค่าว่าง
     * @returns ไม่มี
     */
    @Override
    public void JobS() {
        super.JobS();
        System.out.println(jobs);
    }
}
