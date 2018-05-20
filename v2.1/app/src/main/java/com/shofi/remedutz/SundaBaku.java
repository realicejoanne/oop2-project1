package com.shofi.remedutz;

import android.os.Parcel;
import android.os.Parcelable;

public class SundaBaku implements Parcelable {

    int image;

    public SundaBaku(int image) {

        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.image);
    }

    protected SundaBaku(Parcel in) {
        this.image = in.readInt();
    }

    public static final Parcelable.Creator<SundaBaku> CREATOR = new Parcelable.Creator<SundaBaku>() {
        @Override
        public SundaBaku createFromParcel(Parcel source) {
            return new SundaBaku(source);
        }

        @Override
        public SundaBaku[] newArray(int size) {
            return new SundaBaku[size];
        }
    };

}
