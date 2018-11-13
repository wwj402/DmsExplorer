/*
 * Copyright (c) 2017 大前良介 (OHMAE Ryosuke)
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/MIT
 */

package net.mm2d.dmsexplorer.core.domain;

import androidx.annotation.NonNull;
import io.reactivex.Observable;


/**
 * @author <a href="mailto:ryo@mm2d.net">大前良介 (OHMAE Ryosuke)</a>
 */
public interface ServerRepository {

    void initialize();

    void terminate();

    void reset();

    void startSearch();

    void stopSearch();

    @NonNull
    Observable<DiscoveryEvent> getDiscoveryObservable();
}
