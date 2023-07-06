package com.github.white.principle.lsp.demo;

import com.github.white.principle.lsp.demo.d1.OldBiliBiliPlayer;
import com.github.white.principle.lsp.demo.d1.OldCommonUser;
import com.github.white.principle.lsp.demo.d1.OldVipUser;
import com.github.white.principle.lsp.demo.d2.BiliBiliPlayer;
import com.github.white.principle.lsp.demo.d2.CommonUser;
import com.github.white.principle.lsp.demo.d2.VipUser;

/**
 * @author White
 */
public class LiskovSubstitutionPrincipleTest {

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        OldCommonUser oldCommonUser = new OldCommonUser(1);
        OldVipUser oldVipUser = new OldVipUser(2);

        OldBiliBiliPlayer player = new OldBiliBiliPlayer();
        player.play(oldCommonUser);
        player.play(oldVipUser);
    }

    private static void test2() {
        CommonUser commonUser = new CommonUser(1);
        VipUser vipUser = new VipUser(2);

        BiliBiliPlayer player = new BiliBiliPlayer();
        player.play(commonUser);
        player.play(vipUser);
    }
}

