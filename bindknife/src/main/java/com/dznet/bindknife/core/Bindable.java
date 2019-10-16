
package com.dznet.bindknife.core;

public interface Bindable {

    default <T> void bind(T t) {
        BindKnife.bind(this,t);
    }

}
