import androidx.compose.ui.window.ComposeUIViewController
import org.compose.kmm.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
