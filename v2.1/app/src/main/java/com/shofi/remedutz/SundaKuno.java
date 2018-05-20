package com.shofi.remedutz;

import android.os.Parcel;
import android.os.Parcelable;

public class SundaKuno implements Parcelable {
    int image;

    public SundaKuno(int image) {
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

    protected SundaKuno(Parcel in) {
        this.image = in.readInt();
    }

    public static final Parcelable.Creator<SundaKuno> CREATOR = new Parcelable.Creator<SundaKuno>() {
        @Override
        public SundaKuno createFromParcel(Parcel source) {
            return new SundaKuno(source);
        }

        @Override
        public SundaKuno[] newArray(int size) {
            return new SundaKuno[size];
        }
    };

}
