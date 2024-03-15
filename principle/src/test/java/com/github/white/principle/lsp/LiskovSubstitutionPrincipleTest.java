package com.github.white.principle.lsp;

import org.junit.jupiter.api.Test;

import com.github.white.principle.BasePrincipleTest;
import com.github.white.principle.lsp.demo.d1.OldBiliBiliPlayer;
import com.github.white.principle.lsp.demo.d1.OldCommonUser;
import com.github.white.principle.lsp.demo.d1.OldVipUser;
import com.github.white.principle.lsp.demo.d2.BiliBiliPlayer;
import com.github.white.principle.lsp.demo.d2.CommonUser;
import com.github.white.principle.lsp.demo.d2.VipUser;

/**
 * @author White
 */
class LiskovSubstitutionPrincipleTest implements BasePrincipleTest {

    @Test
    void test1() {
        execute(() -> {
            OldCommonUser oldCommonUser = new OldCommonUser(1);
            OldVipUser oldVipUser = new OldVipUser(2);

            OldBiliBiliPlayer player = new OldBiliBiliPlayer();
            player.play(oldCommonUser);
            player.play(oldVipUser);
        });
    }

    @Test
    void test2() {
        execute(() -> {
            CommonUser commonUser = new CommonUser(1);
            VipUser vipUser = new VipUser(2);

            BiliBiliPlayer player = new BiliBiliPlayer();
            player.play(commonUser);
            player.play(vipUser);
        });
    }
}

