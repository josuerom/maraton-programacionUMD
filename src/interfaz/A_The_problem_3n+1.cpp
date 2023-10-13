/**
   ░░█ █▀█ █▀ █░█ █▀▀ █▀█ █▀█ █▀▄▀█
   █▄█ █▄█ ▄█ █▄█ ██▄ █▀▄ █▄█ █░▀░█
   created: 12/10/23 23:47:15
**/
#include <bits/stdc++.h>

using namespace std;

const int N = 1e6 + 7;
int dp[N] = {0, 1};

int main() {
   ios::sync_with_stdio(false);
   cin.tie(0);
   int i = 0, j = 0;
   while (cin >> i >> j) {
      cout << i <<" "<< j << " ";
      int t = max(i, j);
      i = min(i, j);
      j = t;
      int ans = 0;
      for (int k = j; k >= i; k--) {
         int b = 1, n = k;
         while (n != 1) {
            if (dp[n] != 0) {
               b += dp[n];
               break;
            }
            if (n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            ++b;
         }
         dp[i] = b;
         ans = max(ans, b);
      }
      cout << ans << '\n';
   }
   return 0;
}
