package com.next.mail.appuser;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class AppUser implements UserDetails {

  private Long id;
  private String name;
  private String username;
  private String email;
  private String password;
  private AppUserRole role;
  private boolean locked;
  private boolean enabled;


  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {

    SimpleGrantedAuthority authority = new SimpleGrantedAuthority();
    return null;
  }

  @Override
  public String getPassword() {
    return null;
  }

  @Override
  public String getUsername() {
    return null;
  }

  @Override
  public boolean isAccountNonExpired() {
    return false;
  }

  @Override
  public boolean isAccountNonLocked() {
    return false;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return false;
  }

  @Override
  public boolean isEnabled() {
    return false;
  }
}
