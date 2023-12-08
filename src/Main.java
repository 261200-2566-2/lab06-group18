

import Accessories.Body.Armor;
import Accessories.Head.Headgear;
import Characters.Jobs.Hunter;
import Characters.Jobs.Sage;

public class Main {
    public static void main(String[] args) {
        Sage TRex = new Sage();
        TRex.Charlevel = 31;
        TRex.base_runspeed = 50;
        TRex.getstatusCharacter();
        System.out.print("Character : TRex"+"\n");
        TRex.GetLevelUp();
        TRex.StatusCharacter();
        TRex.JobS();
        TRex.AttackType();
        TRex.AttackDistance();

        System.out.print("---------------------------"+"\n");

        Hunter SUCHA = new Hunter();
        SUCHA.Charlevel = 99;
        SUCHA.base_runspeed = 40;
        SUCHA.getstatusCharacter();
        System.out.print("Character : SUCHA"+"\n");
        SUCHA.GetLevelUp();
        SUCHA.StatusCharacter();
        SUCHA.JobS();
        SUCHA.AttackType();
        SUCHA.AttackDistance();

        System.out.print("---------------------------"+"\n");

        Headgear B = new Headgear();
        System.out.print("Accessories : B"+"\n");
        B.Accessorieslevel = 3;
        B.BuffHp =30;
        B.BuffMana =2;
        B.Buff_atk =0;
        B.Buff_def =4;
        B.Buff_runspeed =2;
        B.GetEpicITEM();
        B.NormalOREpic(B.UseEpicITEM());
        B.getstatusAccessories();
        B.StatusAccessories();
        System.out.print("Ability: ");
        B.abilityHeadgear2();
        B.abilityHeadgear3();

        System.out.print("---------------------------"+"\n");

        Armor A = new Armor();
        System.out.print("Accessories : B"+"\n");
        A.Accessorieslevel = 10;
        A.BuffHp =20;
        A.BuffMana =20;
        A.Buff_atk =0;
        A.Buff_def =35;
        A.Buff_runspeed =-2;
        A.GetEpicITEM();
        A.NormalOREpic(B.UseEpicITEM());
        A.getstatusAccessories();
        A.StatusAccessories();
        System.out.print("Ability: ");
        A.abilityArmor1();
        A.abilityArmor2();
        A.abilityArmor3();

        System.out.print("---------------------------"+"\n");
    }
}