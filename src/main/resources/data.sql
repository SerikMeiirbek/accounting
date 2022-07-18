INSERT INTO company (created_time, created_user_id, is_deleted, updated_time, updated_user_id, address1, address2, email, enabled, establishment_date, phone, representative, state,
                     zip)
VALUES ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'Street1 ', 'House Nu: 1', 'root@root.com', TRUE, '2022-07-17', '5551457489', 'Representative Root', 'Alabama',
        '35242'),
       ('2022-04-10 00:00:00', 1, FALSE, '2022-04-10 00:00:00', 1, 'Street2 ', 'House Nu: 2', 'admin1@admin.com', TRUE, '2022-04-10', '5551457478', 'Admin1 Root', 'Arizona',
        '38704'),
       ('2022-01-11 00:00:00', 1, FALSE, '2022-01-11 00:00:00', 1, 'Street3 ', 'House Nu: 3', 'admin3@admin.com', TRUE, '2022-01-11', '5551457365', 'Admin2 Root', 'Florida',
        '30307');

INSERT INTO client_vendor (created_time, created_user_id, is_deleted, updated_time, updated_user_id, address, company_title, email, phone, state_id, type, zip_code, company_id)
VALUES ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'Street 1', 'Company1', 'company1@email.com', '1234567890', 'Alabama', 'Client', '35242', 1),
       ('2022-05-02 00:00:00', 1, FALSE, '2022-05-02 00:00:00', 1, 'Street 2', 'Company2', 'company2@email.com', '4574125477', 'Arizona', 'Vendor', '38704', 2),
       ('2022-05-03 00:00:00', 1, FALSE, '2022-05-03 00:00:00', 1, 'Street 3', 'Company3', 'company3@email.com', '7894561230', 'Florida', 'Client', '33024', 3);

INSERT INTO category(created_time, created_user_id, is_deleted, updated_time, updated_user_id, description, enabled, company_id)
VALUES ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'Electronics', TRUE, 1),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'Phone', TRUE, 1),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'Sports', TRUE, 2);

INSERT INTO invoice(created_time, created_user_id, is_deleted, updated_time, updated_user_id, enabled, invoice_date, invoice_number, invoice_status, invoice_type, client_vendor_id, company_id)
VALUES ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, TRUE, '2022-06-02', 'P-INV001', 'Approved', 'Purchase',2,1),
       ('2022-05-02 00:00:00', 1, FALSE, '2022-05-02 00:00:00', 1, TRUE, '2022-06-03', 'S-INV001', 'Approved', 'Sale',1,2),
       ('2022-05-03 00:00:00', 1, FALSE, '2022-05-03 00:00:00', 1, TRUE, '2022-06-03', 'S-INV002', 'Pending', 'Sale',1,2);

INSERT INTO product(created_time, created_user_id, is_deleted, updated_time, updated_user_id, description, low_limit_alert, name, status, unit, category_id, company_id)
VALUES ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'TV', 5, 'TV', 'active', 'pieces', 1, 1),
       ('2022-05-02 00:00:00', 1, FALSE, '2022-05-02 00:00:00', 1, 'Phone', 10, 'Iphone', 'active', 'pieces', 2, 2),
       ('2022-05-03 00:00:00', 1, FALSE, '2022-05-03 00:00:00', 1, 'Sports', 3, 'Shoe', 'active', 'pieces', 3, 2);

INSERT INTO stock_details(created_time, created_user_id, is_deleted, updated_time, updated_user_id, i_date, price, quantity, remaining_quantity, product_id)
VALUES ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, '2022-06-02', 20, 10, 10, 1),
       ('2022-05-02 00:00:00', 1, FALSE, '2022-05-02 00:00:00', 1, '2022-06-03', 15, 30, 15, 2),
       ('2022-05-03 00:00:00', 1, FALSE, '2022-05-03 00:00:00', 1, '2022-06-04', 5, 15, 5, 3);

INSERT INTO invoice_product(created_time, created_user_id, is_deleted, updated_time, updated_user_id, name, price, profit, qty, tax, invoice_id, product_id)
VALUES ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'TV', 15, 200, 10, 8, 1, 1),
       ('2022-05-02 00:00:00', 1, FALSE, '2022-05-02 00:00:00', 1, 'Iphone', 200, 3000, 10, 10, 2, 2),
       ('2022-05-03 00:00:00', 1, FALSE, '2022-05-03 00:00:00', 1, 'Shoe', 5, 100, 3, 5, 3, 3);

INSERT INTO payment(created_time, created_user_id, is_deleted, updated_time, updated_user_id, amount, institution_id, is_paid, month, year, company_id)
VALUES ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 250, 1, FALSE, 'January', '2022-01-01', 1),
       ('2022-05-02 00:00:00', 1, FALSE, '2022-05-02 00:00:00', 1, 250, 1, FALSE, 'February', '2022-02-01', 1),
       ('2022-05-03 00:00:00', 1, FALSE, '2022-05-03 00:00:00', 1, 250, 1, FALSE, 'March', '2022-03-01', 1);

INSERT INTO role(created_time, created_user_id, is_deleted, updated_time, updated_user_id, enabled, name)
VALUES ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, TRUE, 'Root'),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, TRUE, 'Admin'),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, TRUE, 'Manager'),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, TRUE, 'Employee');

INSERT INTO users(created_time, created_user_id, is_deleted, updated_time, updated_user_id, email, enabled, first_name, last_name, pass_word, phone, company_id, role_id)
VALUES ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'root@root.com', TRUE, 'Root', 'RootSurname', 'Abc1', '0000000000', 1, 1),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'admin1@admin.com', TRUE, 'Admin1', 'AdminLName1', 'Abc1', '0000000001', 2, 2),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'admin2@admin.com', TRUE, 'Admin2', 'AdminLName2', 'Abc1', '0000000002', 3, 2),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'manager1@admin.com', TRUE, 'Manager1', 'ManagerLName1', 'Abc1', '0000000003', 2, 3),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'manager2@admin.com', TRUE, 'Manager2', 'ManagerLName2', 'Abc1', '0000000004', 2, 3),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'manager3@admin.com', TRUE, 'Manager3', 'ManagerLName3', 'Abc1', '0000000005', 3, 3),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'manager4@admin.com', TRUE, 'Manager4', 'ManagerLName4', 'Abc1', '0000000006', 3, 3),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'employee1@employee.com', TRUE, 'Employee1', 'EmployeeLName1', 'Abc1', '0000000007', 2, 4),
       ('2022-05-01 00:00:00', 1, FALSE, '2022-05-01 00:00:00', 1, 'employee2@employee.com', TRUE, 'Employee2', 'EmployeeLName2', 'Abc1', '0000000008', 2, 4);