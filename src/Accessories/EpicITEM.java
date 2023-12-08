package Accessories;

/**
 * คลาส EpicITEM สำหรับอุปกรณ์หรูหรา
 */
public class EpicITEM extends Accessories {
    private boolean IsEpicITEM = false;

    private boolean CallEpic = true;

    /**
     * ใช้ EpicITEM หรือไม่
     *
     * @returns true ถ้าใช้ EpicITEM, false ถ้าไม่ใช้
     */
    public boolean UseEpicITEM() {
        return IsEpicITEM;
    }

    /**
     * เลือกระหว่าง Normal หรือ Epic
     *
     * @param x true ถ้าเลือก Epic, false ถ้าเลือก Normal
     * @effects prints "EpicITEM : YES!" ถ้า x เป็น true
     *          prints "EpicITEM : NO!" ถ้า x เป็น false
     */
    public void NormalOREpic(boolean x){
        if (x){
            System.out.println("EpicITEM : YES!");
        }
        else {
            System.out.println("EpicITEM : NO!");
        }
    }

    /**
     * รับ EpicITEM
     *
     * @requires CallEpic ต้องเป็น true
     * @returns ไม่มี
     * @effects increases all Buff values by 10%
     *          sets CallEpic to false
     *          sets IsEpicITEM to true
     */
    public void GetEpicITEM(){
        if (CallEpic){
            increaseAllBuff();
            CallEpic = false;
            IsEpicITEM = true;
        }
    }

    /**
     * เพิ่มค่า Buff ทั้งหมดขึ้นตามเปอร์เซ็นต์ที่กำหนด
     *
     * @modifies แก้ไขค่า Buff ทั้งหมด
     */
    private void increaseAllBuff() {
        Buff_atk += 0.1 * Buff_atk;
        Buff_def += 0.1 * Buff_def;
        BuffHp += 0.1 * BuffHp;
        BuffMana += 0.1 * BuffMana;
        Buff_runspeed += 0.1 * Buff_runspeed;
    }
}
