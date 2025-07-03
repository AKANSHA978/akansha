// @ts-check
const { test, expect } = require('@playwright/test');

test('Simple login test', async ({ page }) => {
    // 1. Navigate to login page
    await page.goto('https://example.com/login');

    // 2. Fill in username and password
    await page.getByLabel('Username').fill('your_username');

    await page.fill('#password', 'your_password');

    // 3. Click login button
    await page.click('button[type="submit"]');

    // 4. Assert login was successful
    await expect(page).toHaveURL('https://example.com/dashboard'); // expected landing URL
    await expect(page.locator('h1')).toContainText('Welcome');
});
