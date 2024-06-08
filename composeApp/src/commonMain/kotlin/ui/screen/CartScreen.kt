package ui.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import theme.textColor
import travelbuddy.composeapp.generated.resources.Res
import travelbuddy.composeapp.generated.resources.cart_tab
import travelbuddy.composeapp.generated.resources.menu_cart
import travelbuddy.composeapp.generated.resources.menu_home

data object CartScreen : Tab {

    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(Res.string.cart_tab)
            val icon = painterResource(Res.drawable.menu_cart)

            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        CartScreenView()
    }
}

@Composable
fun CartScreenView(){
    Surface(modifier = Modifier.fillMaxWidth()) {
        Text(
            modifier = Modifier.wrapContentSize(Alignment.Center),
            text = "Cart",
            color = textColor,
            style = MaterialTheme.typography.bodySmall,
        )
    }
}