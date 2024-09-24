package eu.kanade.tachiyomi.ui.reader.viewer.navigation

import android.graphics.RectF
import eu.kanade.tachiyomi.ui.reader.viewer.ViewerNavigation

/**
 * Visualization of default state without any inversion
 * +---+---+---+
 * | X | M | X |   P: Previous
 * +---+---+---+
 * | X | M | X |   M: Menu
 * +---+---+---+
 * | X | M | X |   N: Next
 * +---+---+---+
 *                 X: None
*/

class EdgeNavigation : ViewerNavigation() {

    override var regionList: List<Region> = listOf(
        Region(
            rectF = RectF(0f, 0f, 0.33f, 1f),
            type = NavigationRegion.NONE,
        ),
        Region(
            rectF = RectF(0.66f, 0f, 1f, 1f),
            type = NavigationRegion.NONE,
        ),
    )
}
