// @filename: orangehrm-login.spec.js
const { test, expect } = require('@playwright/test');

test('OrangeHRM Login Test', async ({ page }) => {
    // 1. Go to OrangeHRM Demo Site
    await page.goto('https://opensource-demo.orangehrmlive.com/');

    // 2. Fill in Username and Password
    await page.fill('input[name="username"]', 'Admin');
    await page.fill('input[name="password"]', 'admin123');

    // 3. Click the Login button
    await page.click('button[type="submit"]');

    // 4. Verify successful login by checking dashboard visibility
    await expect(page.locator('h6')).toHaveText('Dashboard');
});
