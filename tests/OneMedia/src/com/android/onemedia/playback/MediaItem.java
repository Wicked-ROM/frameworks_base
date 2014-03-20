/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.onemedia.playback;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.media.MediaItemMetadata;

/**
 * TODO: Insert description here. (generated by epastern)
 */
public class MediaItem implements Parcelable {
    private Bundle mBundle;

    public MediaItem() {

    }

    private MediaItem(Parcel in) {
        mBundle = in.readBundle();
    }

    public String getTitle() {
        return mBundle.getString(MediaItemMetadata.KEY_TITLE);
    }

    public String getArtist() {
        return mBundle.getString(MediaItemMetadata.KEY_ALBUM_ARTIST);
    }

    /* (non-Javadoc)
     * @see android.os.Parcelable#describeContents()
     */
    @Override
    public int describeContents() {
        // TODO(epastern): Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * @see android.os.Parcelable#writeToParcel(android.os.Parcel, int)
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeBundle(mBundle);
    }

    public static final Parcelable.Creator<MediaItem> CREATOR
            = new Parcelable.Creator<MediaItem>() {
                public MediaItem createFromParcel(Parcel in) {
                    return new MediaItem(in);
                }

                public MediaItem[] newArray(int size) {
                    return new MediaItem[size];
                }
            };

}
