package Characters.Jobs;

import Characters.ClassCharacters.Archer;

/**
 * คลาส Hunter ซึ่งเป็นคลาสย่อยของ Archer
 */
public class Hunter extends Archer {
    public final String jobs = "Hunter";

    /**
     * แสดงงาน (Job) ของ Hunter
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
