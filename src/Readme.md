## Approach followed in loop

1️⃣ Sabse phele initialization hoga sirf 1 baar, jisae hym likhte hai **" int i = 1; "**

2️⃣ Phir condition check karte hai, agar true hui toh loop kae andar jayenge agar condition false hui toh loop kae anadr enter nhi karenge. Condition hum likhte hai **" i <= 5; "**

3️⃣ Agar condition true hui toh hum joh loop ki body mae hoga usae execute karenge aur phir execution kae baad phir hum increment karenge **" i++; "**

4️⃣ Humae ismae U follow karna hota hai **" condition »» execute body »» increment "**. Aur tub tuk follow hoiga jub tuk condition false na ho jaye.

    for (int i = 1; i <= 10; i++){
      System.out.println(i);
    }
