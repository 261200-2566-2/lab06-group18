package Characters.Jobs;

import Characters.ClassCharacters.SwordMan;

/**
 * คลาส Knight ซึ่งเป็นคลาสย่อยของ SwordMan
 */
public class Knight extends SwordMan {
    public final String jobs = "Knight";

    /**
     * แสดงงาน (Job) ของ Knight
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
