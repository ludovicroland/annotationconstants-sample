package com.myapp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import android.support.annotation.LayoutRes;

public abstract class Annotation
{

  @Retention(RetentionPolicy.RUNTIME)
  @Target({ ElementType.TYPE })
  @Inherited
  public @interface MyAnnotation
  {

    @LayoutRes
    int myAttribut();
  }

}
