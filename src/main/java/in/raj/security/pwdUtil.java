package in.raj.security;
import java.util.Base64;
import java.util.Base64.Encoder;

public class pwdUtil {
	public String pwdEncoderString(String text) {
		Encoder encoder = Base64.getEncoder();
		String encoderToString = encoder.encodeToString(text.getBytes());
		return encoderToString;
	}
}
