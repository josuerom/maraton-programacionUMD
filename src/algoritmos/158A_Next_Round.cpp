/**
* author:  josuerom
* created: 13/02/23 14:57
**/
#pragma GCC optimize("03,unroll-loops")
#include <iostream>
using namespace std;

int main() {
   ios::sync_with_stdio(false); cin.tie(0);
   short n, k, amount=0;
   cin >> n >> k;
   short vec[n];
   for (short i = 0; i < n; i++) cin >> vec[i];
   for (short j = 0; j < n; j++) if (vec[j] >= vec[k-1] && vec[j] > 0) amount++;
   cout << amount << '\n';
   return 0;
}
