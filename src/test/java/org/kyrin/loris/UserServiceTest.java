package org.kyrin.loris;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.kyrin.loris.servlet.model.User;
import org.kyrin.loris.servlet.service.UserService;

/**
 * UserService单元测试
 * @author kyrin
 *
 */
public class UserServiceTest {

	private final UserService userService;

	public UserServiceTest() {
		userService = new UserService();
	}

	@Before
	public void init() {
		//TODO 初始化数据库
	}

	@Test
	public void getUserList() {
		List<User> userList = userService.getUserList();
		Assert.assertEquals(2, userList.size());
	}

}
