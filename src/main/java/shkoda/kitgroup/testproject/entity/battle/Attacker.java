package shkoda.kitgroup.testproject.entity.battle;

import shkoda.kitgroup.testproject.entity.battle.Damage;

/**
 * Created by Nightingale on 27.08.2015.
 */
public interface Attacker {
    Damage generateDamage();

  default   void attack(Attackable victim){
      Damage damage = generateDamage();
      victim.acceptDamage(damage);
  }
}
