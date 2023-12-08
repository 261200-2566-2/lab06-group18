package Accessories;

/**
 * คลาส Accessories สำหรับการจัดเก็บข้อมูลและคำนวณสถิติของอุปกรณ์
 */
public class Accessories {
    public int Accessorieslevel;
    public double BuffHp, BuffMana, Buff_atk, Buff_def, Buff_runspeed;

    private boolean onecall = true;

    /**
     * คำนวณและอัพเดทสถิติของอุปกรณ์
     *
     * @requires Accessorieslevel ต้องไม่เป็นลบ
     * @effects BuffHp, BuffMana, Buff_runspeed, Buff_atk, Buff_def ถูกอัพเดทโดยการคำนวณ
     * @modifies BuffHp, BuffMana, Buff_runspeed, Buff_atk, Buff_def
     */
    public void getstatusAccessories() {
        if (onecall && Accessorieslevel >= 0) {
            BuffHp += 0.5 * Accessorieslevel;
            BuffMana += 2 * Accessorieslevel;
            Buff_runspeed += Accessorieslevel * (0.1 * Accessorieslevel);
            Buff_atk += 0.4 * Accessorieslevel;
            Buff_def += 0.8 * Accessorieslevel;
            onecall = false;
        }
    }

    /**
     * แสดงสถิติของอุปกรณ์
     *
     * @requires getstatusAccessories ต้องถูกเรียกก่อนการใช้งานเมทอดนี้
     * @effects แสดงข้อมูลสถิติทั้งหมดบนหน้าจอ
     */
    public void StatusAccessories() {
        getstatusAccessories();
        System.out.print("Level : " + Accessorieslevel + "\n");
        System.out.print("BuffHp : " + BuffHp + "\n");
        System.out.print("BuffMana : " + BuffMana + "\n");
        System.out.print("BuffRunSpeed : " + Buff_runspeed + "\n");
        System.out.print("Buff_atk : " + Buff_atk + "\n");
        System.out.print("Buff_def : " + Buff_def + "\n");
    }

    /**
     * แสดงประเภทของอุปกรณ์
     *
     * @effects แสดงข้อมูลประเภทอุปกรณ์บนหน้าจอ
     */
    public void AccessoriesType() {
        System.out.print("AccessoriesType : ");
    }

    /**
     * แสดงประเภทการโจมตี
     *
     * @effects แสดงข้อมูลประเภทการโจมตีบนหน้าจอ
     */
    public void AttackType() {
        System.out.print("AttackType : ");
    }

    /**
     * แสดงข้อมูลอาชีพ
     *
     * @effects แสดงข้อมูลอาชีพบนหน้าจอ
     */
    public void JobS() {
        System.out.print("Jobs : ");
    }
}
