#### 1.1.25使用数学归纳法证明欧几里得算法能够计算任意一对非负整数p和q的最大公约数。

**1)      基础步骤:求证gcd(p,q)=gcd(q,r)**

**证：令p=a*q+r,其中p、a、q、r均为非负整数。**

**设整数d|p、d|q,则d|(p-a*q),得p与q的公约数和q与r的公约数相同。**

**设整数d|q、d|r,则d|(a*q+r),得q与r的公约数和p与r的公约数相同。基于上述两点得gcd(p,q)=gcd(q,r)。**

**2)      归纳步骤：设有gcd(p,q)=gcd(q,r)，求证gcd(q,r)=gcd(r, q%r)**

**证：由gcd(p,q)=gcd(q,r)可得d|p、d|q、d|r、p=a*q+r。**

**由于有q=⌊q/r⌋*r+q%r、d|q、d|r，所以有d|q%r所以有gcd(q,r)=gcd(r,q%r)。**

