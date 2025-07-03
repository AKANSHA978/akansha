const { test, expect } = require('@playwright/test');

test('SauceDemo Test', async ({ page }) => {

    await page.goto('https://www.saucedemo.com/');

    await page.fill('input[id="user-name"]', 'standard_user');
    await page.fill('input[id="password"]', 'secret_sauce');

    await page.waitForSelector('#login-button', { state: 'visible' });
    await page.click('#login-button');

    await page.click('#add-to-cart-sauce-labs-backpack');
    await page.click('.shopping_cart_link');
    await page.click('#checkout');
    await page.fill('input[id="first-name"]', 'akansha');
    await page.fill('input[id="last-name"]', "bidua");
    await page.fill('input[id="postal-code"]', '887676');
    await page.click('#continue');
    await page.click('#finish');
})