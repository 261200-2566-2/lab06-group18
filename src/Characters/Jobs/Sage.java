package Characters.Jobs;

import Characters.ClassCharacters.Magician;

/**
 * คลาส Sage ซึ่งเป็นคลาสย่อยของ Magician
 */
public class Sage extends Magician {
    public final String jobs = "Sage";

    /**
     * แสดงงาน (Job) ของ Sage
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
