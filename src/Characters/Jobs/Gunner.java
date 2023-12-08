package Characters.Jobs;

import Characters.ClassCharacters.Archer;

/**
 * คลาส Gunner ซึ่งเป็นคลาสย่อยของ Archer
 */
public class Gunner extends Archer {
    public final String jobs = "Gunner";

    /**
     * แสดงงาน (Job) ของ Gunner
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
