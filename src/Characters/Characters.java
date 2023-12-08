package Characters;

/**
 * คลาส Characters สำหรับการจัดเก็บข้อมูลและความสามารถของตัวละคร
 */
public class Characters {
    public int Charlevel;
    public double maxHp, maxMana, base_atk, base_def, base_runspeed, max_runspeed;

    /**
     * อัปเดตข้อมูลสถานะของตัวละคร
     *
     * @effects อัปเดตข้อมูลสถานะของตัวละคร
     */
    public void getstatusCharacter() {
        base_runspeed = 10 + 10 * Charlevel;
        maxHp = 100 + 10 * Charlevel;
        maxMana = 50 + 2 * Charlevel;
        max_runspeed = base_runspeed * (0.1 + 0.03 * Charlevel);
        base_atk = 35 + 4 * Charlevel;
        base_def = 5 + 3 * Charlevel;
    }

    /**
     * แสดงข้อมูลสถานะของตัวละคร
     *
     * @effects แสดงข้อมูลสถานะของตัวละคร
     */
    public void StatusCharacter() {
        getstatusCharacter();
        System.out.print("Level : " + Charlevel + "\n");
        System.out.print("MaxHP : " + maxHp + "\n");
        System.out.print("MaxMana : " + maxMana + "\n");
        System.out.print("MaxRunSpeed : " + max_runspeed + "\n");
        System.out.print("atk : " + base_atk + "\n");
        System.out.print("def : " + base_def + "\n");
    }

    /**
     * เพิ่มระดับของตัวละคร
     *
     * @effects เพิ่มระดับของตัวละครและอัปเดตข้อมูลสถานะ
     */
    public void GetLevelUp() {
        Charlevel++;
        getstatusCharacter();
    }

    /**
     * แสดงประเภทการโจมตี
     *
     * @effects แสดงประเภทการโจมตี
     */
    public void AttackDistance() {
        System.out.print("AttackDistance : ");
    }

    /**
     * แสดงลักษณะการโจมตี
     *
     * @effects แสดงลักษณะการโจมตี
     */
    public void AttackType() {
        System.out.print("AttackType : ");
    }

    /**
     * แสดงอาชีพของตัวละคร
     *
     * @effects แสดงอาชีพของตัวละคร
     */
    public void JobS() {
        System.out.print("Jobs : ");
    }
}
