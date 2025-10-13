<html>
<head>
    <title>My Address Book</title>
</head>
<body>
<h1>My Address Book</h1>

<p><strong>Management</strong></p>
<ul>
    <?php echo anchor('home/AddEntry', 'Add Entry to Address Book'); ?>
    <li><p><?php echo anchor('Delete', 'Delete Entry in Address Book'); ?></p></li>
    <li><p><?php echo anchor('Update', 'Update Address Book Entry'); ?></p></li>
</ul>

<p><strong>Viewing</strong></p>
<ul>
    <li><p><?php echo anchor('Select', 'Select an Entry to View'); ?></p></li>
    <li><p><?php echo anchor('All', 'View all contacts'); ?></p></li>
</ul>
</body>
</html>
