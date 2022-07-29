package br.com.papait.bruno.api.parkingcontrol.config.security;

import br.com.papait.bruno.api.parkingcontrol.model.UserModel;
import br.com.papait.bruno.api.parkingcontrol.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

	private final UserRepository userRepository;

	public UserDetailsServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserModel userModel = userRepository.findByUsername(username)
						.orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

		return new User(
						userModel.getUsername(),
						userModel.getPassword(),
						userModel.isEnabled(),
						userModel.isAccountNonExpired(),
						userModel.isCredentialsNonExpired(),
						userModel.isAccountNonLocked(),
						userModel.getAuthorities());
	}
}
