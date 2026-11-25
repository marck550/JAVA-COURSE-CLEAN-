$repoUrl = Read-Host "Paste your new GitHub repository URL (ending in .git)"

Remove-Item -Path "push_all.ps1", "setup_weeks.ps1", "create_weeks_1_to_4.ps1" -ErrorAction SilentlyContinue

if (-not (Test-Path ".git")) {
    git init
}

$remotes = git remote
if ($remotes -contains "origin") {
    git remote set-url origin $repoUrl
} else {
    git remote add origin $repoUrl
}

git branch -M main
git add .
git commit -m "Complete Java coursework Weeks 1 to 10"
git push -u origin main

Write-Host "Done! Refresh your GitHub repository page in the browser." -ForegroundColor Green