package Controller;

import org.hibernate.Session.LockRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.capstone.User;

@SuppressWarnings("deprecation")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private static final String Object = null;

	@Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody String userDto) {
        // Validate userDto fields (e.g., username, password, etc.)
        // Perform necessary validations and handle errors

        @SuppressWarnings("unused")
		User registeredUser = ExecutorService(userDto);
        return ResponseEntity.ok("User registered successfully");
    }

    private User ExecutorService(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LockRequest loginRequest) {
        authenticationManager.authenticate(
		        new UsernamePasswordAuthenticationToken(((User) loginRequest).getUsername(), ((UserDetails) loginRequest).getPassword())
		);

        return ResponseEntity.ok(new Object());
    }

	public static String getObject() {
		return Object;
	}
}
