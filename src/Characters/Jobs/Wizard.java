package Characters.Jobs;

import Characters.ClassCharacters.Magician;

/**
 * คลาส Wizard ซึ่งเป็นคลาสย่อยของ Magician
 */
public class Wizard extends Magician {
    public final String jobs = "Wizard";

    /**
     * แสดงงาน (Job) ของ Wizard
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
