<html>
<head>
    <title>Add an Entry</title>
</head>
<body>
<h1>Add an Entry</h1>
<?php echo form_open('Add'); ?>

<p><strong>First Name:</strong>
    <input type="text" name="f_name" size="30" maxlength="25" value="<?php echo set_value('f_name'); ?>"/>
    <?php if (isset($validation)) { echo $validation->getError('f_name'); }?><br/>

<p><strong>Surname:</strong>
    <input type="text" name="l_name" size="30" maxlength="25"value="<?php echo set_value('l_name'); ?>">
    <?php if (isset($validation)) { echo $validation->getError('l_name'); }?><br/>

<p><strong>Address:</strong><br/>
    <input type="text" name="address" size="75" value="<?php echo set_value('address'); ?>" size="50" />
    <?php if (isset($validation)) { echo $validation->getError('address'); }?><br/>


<p><strong>City:</strong><br/>
    <input type="text" name="city" size="30" maxlength="50" value="<?php echo set_value('city'); ?>"/>
    <?php if (isset($validation)) { echo $validation->getError('city'); }?><br/>

<p><strong>County:</strong><br/>
    <input type="text" name="town" size="30" maxlength="30" value="<?php echo set_value('town'); ?>"/>
    <?php if (isset($validation)) { echo $validation->getError('town'); }?>

<p><strong>Address Type:</strong><br/>
    <input type="radio" name="add_type" value="home" checked> home
    <input type="radio" name="add_type" value="work"> work
    <input type="radio" name="add_type" value="other"> other</p>


<p><strong>Telephone Number:</strong><br/>
    <input type="text" name="tel_number" size="30" maxlength="25" value="<?php echo set_value('tel_number'); ?>"/>
    <input type="radio" name="tel_type" value="home" checked> home
    <input type="radio" name="tel_type" value="work"> work
    <input type="radio" name="tel_type" value="other"> other</p>
<?php if (isset($validation)) { echo $validation->getError('tel_number'); }?>

<p><strong>Fax Number:</strong><br/>
    <input type="text" name="fax_number" size="30" maxlength="25" value="<?php echo set_value('fax_number'); ?>"/>
    <input type="radio" name="fax_type" value="home" checked> home
    <input type="radio" name="fax_type" value="work"> work
    <input type="radio" name="fax_type" value="other"> other</p>
<?php if (isset($validation)) { echo $validation->getError('fax_number'); }?>

<p><strong>Email Address:</strong><br/>
    <input type="text" name="email" size="30" maxlength="150" value="<?php echo set_value('email'); ?>"/>
    <input type="radio" name="email_type" value="home" checked> home
    <input type="radio" name="email_type" value="work"> work
    <input type="radio" name="email_type" value="other"> other</p>
<?php if (isset($validation)) { echo $validation->getError('email'); }?><br/>


<p><input type="submit" name="submit" value="Add Entry"></p>
</form>

<p><?php echo anchor('Menu', 'Back to Home Menu'); ?></p>
</body>
</html>
